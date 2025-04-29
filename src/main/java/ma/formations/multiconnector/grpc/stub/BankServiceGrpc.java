package ma.formations.multiconnector.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest,
      ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse> getCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "customers",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest,
      ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse> getCustomersMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest, ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse> getCustomersMethod;
    if ((getCustomersMethod = BankServiceGrpc.getCustomersMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCustomersMethod = BankServiceGrpc.getCustomersMethod) == null) {
          BankServiceGrpc.getCustomersMethod = getCustomersMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest, ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "customers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("customers"))
                  .build();
          }
        }
     }
     return getCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest,
      ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse> getCustomerByIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "customerByIdentity",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest,
      ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse> getCustomerByIdentityMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest, ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse> getCustomerByIdentityMethod;
    if ((getCustomerByIdentityMethod = BankServiceGrpc.getCustomerByIdentityMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCustomerByIdentityMethod = BankServiceGrpc.getCustomerByIdentityMethod) == null) {
          BankServiceGrpc.getCustomerByIdentityMethod = getCustomerByIdentityMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest, ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "customerByIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("customerByIdentity"))
                  .build();
          }
        }
     }
     return getCustomerByIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest,
      ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse> getCreateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCustomer",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest,
      ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse> getCreateCustomerMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest, ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse> getCreateCustomerMethod;
    if ((getCreateCustomerMethod = BankServiceGrpc.getCreateCustomerMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCreateCustomerMethod = BankServiceGrpc.getCreateCustomerMethod) == null) {
          BankServiceGrpc.getCreateCustomerMethod = getCreateCustomerMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest, ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "createCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("createCustomer"))
                  .build();
          }
        }
     }
     return getCreateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest,
      ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse> getUpdateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCustomer",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest,
      ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse> getUpdateCustomerMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest, ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse> getUpdateCustomerMethod;
    if ((getUpdateCustomerMethod = BankServiceGrpc.getUpdateCustomerMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getUpdateCustomerMethod = BankServiceGrpc.getUpdateCustomerMethod) == null) {
          BankServiceGrpc.getUpdateCustomerMethod = getUpdateCustomerMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest, ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "updateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("updateCustomer"))
                  .build();
          }
        }
     }
     return getUpdateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest,
      ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse> getDeleteCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCustomer",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest,
      ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse> getDeleteCustomerMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest, ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse> getDeleteCustomerMethod;
    if ((getDeleteCustomerMethod = BankServiceGrpc.getDeleteCustomerMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDeleteCustomerMethod = BankServiceGrpc.getDeleteCustomerMethod) == null) {
          BankServiceGrpc.getDeleteCustomerMethod = getDeleteCustomerMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest, ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "deleteCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("deleteCustomer"))
                  .build();
          }
        }
     }
     return getDeleteCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest,
      ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse> getBankAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bankAccounts",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest,
      ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse> getBankAccountsMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest, ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse> getBankAccountsMethod;
    if ((getBankAccountsMethod = BankServiceGrpc.getBankAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getBankAccountsMethod = BankServiceGrpc.getBankAccountsMethod) == null) {
          BankServiceGrpc.getBankAccountsMethod = getBankAccountsMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest, ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "bankAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("bankAccounts"))
                  .build();
          }
        }
     }
     return getBankAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest,
      ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse> getBankAccountByRibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bankAccountByRib",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest,
      ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse> getBankAccountByRibMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest, ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse> getBankAccountByRibMethod;
    if ((getBankAccountByRibMethod = BankServiceGrpc.getBankAccountByRibMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getBankAccountByRibMethod = BankServiceGrpc.getBankAccountByRibMethod) == null) {
          BankServiceGrpc.getBankAccountByRibMethod = getBankAccountByRibMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest, ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "bankAccountByRib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("bankAccountByRib"))
                  .build();
          }
        }
     }
     return getBankAccountByRibMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest,
      ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse> getAddBankAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBankAccount",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest,
      ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse> getAddBankAccountMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest, ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse> getAddBankAccountMethod;
    if ((getAddBankAccountMethod = BankServiceGrpc.getAddBankAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getAddBankAccountMethod = BankServiceGrpc.getAddBankAccountMethod) == null) {
          BankServiceGrpc.getAddBankAccountMethod = getAddBankAccountMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest, ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "addBankAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("addBankAccount"))
                  .build();
          }
        }
     }
     return getAddBankAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest,
      ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse> getAddWirerTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addWirerTransfer",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest,
      ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse> getAddWirerTransferMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest, ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse> getAddWirerTransferMethod;
    if ((getAddWirerTransferMethod = BankServiceGrpc.getAddWirerTransferMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getAddWirerTransferMethod = BankServiceGrpc.getAddWirerTransferMethod) == null) {
          BankServiceGrpc.getAddWirerTransferMethod = getAddWirerTransferMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest, ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "addWirerTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("addWirerTransfer"))
                  .build();
          }
        }
     }
     return getAddWirerTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest,
      ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse> getGetTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTransactions",
      requestType = ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest.class,
      responseType = ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest,
      ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse> getGetTransactionsMethod() {
    io.grpc.MethodDescriptor<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest, ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse> getGetTransactionsMethod;
    if ((getGetTransactionsMethod = BankServiceGrpc.getGetTransactionsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetTransactionsMethod = BankServiceGrpc.getGetTransactionsMethod) == null) {
          BankServiceGrpc.getGetTransactionsMethod = getGetTransactionsMethod = 
              io.grpc.MethodDescriptor.<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest, ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getTransactions"))
                  .build();
          }
        }
     }
     return getGetTransactionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void customers(ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCustomersMethod(), responseObserver);
    }

    /**
     */
    public void customerByIdentity(ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCustomerByIdentityMethod(), responseObserver);
    }

    /**
     */
    public void createCustomer(ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomerMethod(), responseObserver);
    }

    /**
     */
    public void updateCustomer(ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCustomerMethod(), responseObserver);
    }

    /**
     */
    public void deleteCustomer(ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCustomerMethod(), responseObserver);
    }

    /**
     */
    public void bankAccounts(ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBankAccountsMethod(), responseObserver);
    }

    /**
     */
    public void bankAccountByRib(ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBankAccountByRibMethod(), responseObserver);
    }

    /**
     */
    public void addBankAccount(ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBankAccountMethod(), responseObserver);
    }

    /**
     */
    public void addWirerTransfer(ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddWirerTransferMethod(), responseObserver);
    }

    /**
     */
    public void getTransactions(ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest,
                ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse>(
                  this, METHODID_CUSTOMERS)))
          .addMethod(
            getCustomerByIdentityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest,
                ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse>(
                  this, METHODID_CUSTOMER_BY_IDENTITY)))
          .addMethod(
            getCreateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest,
                ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse>(
                  this, METHODID_CREATE_CUSTOMER)))
          .addMethod(
            getUpdateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest,
                ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse>(
                  this, METHODID_UPDATE_CUSTOMER)))
          .addMethod(
            getDeleteCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest,
                ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse>(
                  this, METHODID_DELETE_CUSTOMER)))
          .addMethod(
            getBankAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest,
                ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse>(
                  this, METHODID_BANK_ACCOUNTS)))
          .addMethod(
            getBankAccountByRibMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest,
                ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse>(
                  this, METHODID_BANK_ACCOUNT_BY_RIB)))
          .addMethod(
            getAddBankAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest,
                ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse>(
                  this, METHODID_ADD_BANK_ACCOUNT)))
          .addMethod(
            getAddWirerTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest,
                ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse>(
                  this, METHODID_ADD_WIRER_TRANSFER)))
          .addMethod(
            getGetTransactionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest,
                ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse>(
                  this, METHODID_GET_TRANSACTIONS)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void customers(ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void customerByIdentity(ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCustomerByIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCustomer(ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCustomer(ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCustomer(ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bankAccounts(ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBankAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bankAccountByRib(ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBankAccountByRibMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBankAccount(ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBankAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addWirerTransfer(ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddWirerTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactions(ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest request,
        io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse customers(ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse customerByIdentity(ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest request) {
      return blockingUnaryCall(
          getChannel(), getCustomerByIdentityMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse createCustomer(ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse updateCustomer(ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse deleteCustomer(ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse bankAccounts(ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getBankAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse bankAccountByRib(ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest request) {
      return blockingUnaryCall(
          getChannel(), getBankAccountByRibMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse addBankAccount(ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBankAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse addWirerTransfer(ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddWirerTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse getTransactions(ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse> customers(
        ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse> customerByIdentity(
        ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCustomerByIdentityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse> createCustomer(
        ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse> updateCustomer(
        ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse> deleteCustomer(
        ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse> bankAccounts(
        ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBankAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse> bankAccountByRib(
        ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBankAccountByRibMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse> addBankAccount(
        ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBankAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse> addWirerTransfer(
        ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddWirerTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse> getTransactions(
        ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CUSTOMERS = 0;
  private static final int METHODID_CUSTOMER_BY_IDENTITY = 1;
  private static final int METHODID_CREATE_CUSTOMER = 2;
  private static final int METHODID_UPDATE_CUSTOMER = 3;
  private static final int METHODID_DELETE_CUSTOMER = 4;
  private static final int METHODID_BANK_ACCOUNTS = 5;
  private static final int METHODID_BANK_ACCOUNT_BY_RIB = 6;
  private static final int METHODID_ADD_BANK_ACCOUNT = 7;
  private static final int METHODID_ADD_WIRER_TRANSFER = 8;
  private static final int METHODID_GET_TRANSACTIONS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CUSTOMERS:
          serviceImpl.customers((ma.formations.multiconnector.grpc.stub.Bank.CustomersRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CustomersResponse>) responseObserver);
          break;
        case METHODID_CUSTOMER_BY_IDENTITY:
          serviceImpl.customerByIdentity((ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CustomerByIdentityResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.CreateCustomerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOMER:
          serviceImpl.updateCustomer((ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.UpdateCustomerResponse>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOMER:
          serviceImpl.deleteCustomer((ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.DeleteCustomerResponse>) responseObserver);
          break;
        case METHODID_BANK_ACCOUNTS:
          serviceImpl.bankAccounts((ma.formations.multiconnector.grpc.stub.Bank.BankAccountsRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.BankAccountsResponse>) responseObserver);
          break;
        case METHODID_BANK_ACCOUNT_BY_RIB:
          serviceImpl.bankAccountByRib((ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.BankAccountByRibResponse>) responseObserver);
          break;
        case METHODID_ADD_BANK_ACCOUNT:
          serviceImpl.addBankAccount((ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.AddBankAccountResponse>) responseObserver);
          break;
        case METHODID_ADD_WIRER_TRANSFER:
          serviceImpl.addWirerTransfer((ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.AddWirerTransferResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTIONS:
          serviceImpl.getTransactions((ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.multiconnector.grpc.stub.Bank.GetTransactionsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.formations.multiconnector.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getCustomersMethod())
              .addMethod(getCustomerByIdentityMethod())
              .addMethod(getCreateCustomerMethod())
              .addMethod(getUpdateCustomerMethod())
              .addMethod(getDeleteCustomerMethod())
              .addMethod(getBankAccountsMethod())
              .addMethod(getBankAccountByRibMethod())
              .addMethod(getAddBankAccountMethod())
              .addMethod(getAddWirerTransferMethod())
              .addMethod(getGetTransactionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
