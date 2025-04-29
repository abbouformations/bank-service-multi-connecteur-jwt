package ma.formations.multiconnector.config;

import lombok.AllArgsConstructor;
import ma.formations.multiconnector.common.CommonTools;
import ma.formations.multiconnector.service.exception.BusinessException;
import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.util.Date;

@Configuration
@AllArgsConstructor
public class ModelMapperConfig {
    private CommonTools tools;

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().
                setMatchingStrategy(MatchingStrategies.STANDARD).
                setFieldMatchingEnabled(true).
                setSkipNullEnabled(true).
                setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
        Converter<Date, String> dateToStringConverter = new AbstractConverter<>() {
            @Override
            public String convert(Date date) {
                return tools.dateToString(date);
            }
        };
        Converter<String, Date> stringToDateConverter = new AbstractConverter<>() {
            @Override
            public Date convert(String s) {
                try {
                    return tools.stringToDate(s);
                } catch (ParseException e) {
                    throw new BusinessException(String.format("the date %s doesn't respect the format %s ", s, tools.getDateFormat()));
                }
            }
        };
        modelMapper.addConverter(dateToStringConverter);
        modelMapper.addConverter(stringToDateConverter);

        return modelMapper;
    }
}

