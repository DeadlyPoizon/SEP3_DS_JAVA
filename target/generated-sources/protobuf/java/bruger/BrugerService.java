// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrugerService.proto

package bruger;

public final class BrugerService {
  private BrugerService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bruger_Bruger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bruger_Bruger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bruger_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bruger_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bruger_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bruger_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BrugerService.proto\022\006bruger\"L\n\006Bruger\022" +
      "\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\017\n\007d" +
      "epotID\030\003 \001(\005\022\r\n\005saldo\030\004 \001(\001\"3\n\014HelloRequ" +
      "est\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t" +
      "\"!\n\rHelloResponse\022\020\n\010greeting\030\001 \001(\t2D\n\014H" +
      "elloService\0224\n\005hello\022\024.bruger.HelloReque" +
      "st\032\025.bruger.HelloResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_bruger_Bruger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bruger_Bruger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bruger_Bruger_descriptor,
        new java.lang.String[] { "Username", "Password", "DepotID", "Saldo", });
    internal_static_bruger_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bruger_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bruger_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_bruger_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bruger_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bruger_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}