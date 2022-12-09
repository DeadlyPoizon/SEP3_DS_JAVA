// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrugerService.proto

package GRPC.bruger;

public final class BrugerServiceOuterClass {
  private BrugerServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_Bruger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_Bruger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_BrugerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_BrugerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_BrugerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_BrugerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_Aktie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_Aktie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_AktieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_AktieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_AktieName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_AktieName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_AktieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_AktieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_allAktier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_allAktier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GRPC_bruger_getAllAktier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GRPC_bruger_getAllAktier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BrugerService.proto\022\013GRPC.bruger\"L\n\006Br" +
      "uger\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t" +
      "\022\017\n\007depotID\030\003 \001(\005\022\r\n\005saldo\030\004 \001(\001\"\"\n\016Brug" +
      "erResponse\022\020\n\010response\030\001 \001(\010\"C\n\rBrugerRe" +
      "quest\022#\n\006bruger\030\001 \003(\0132\023.GRPC.bruger.Brug" +
      "er\022\r\n\005param\030\002 \001(\t\"M\n\005Aktie\022\014\n\004navn\030\001 \001(\t" +
      "\022\r\n\005firma\030\002 \001(\t\022\014\n\004pris\030\003 \001(\001\022\014\n\004high\030\004 " +
      "\001(\001\022\013\n\003low\030\005 \001(\001\"`\n\014AktieRequest\022!\n\005akti" +
      "e\030\001 \003(\0132\022.GRPC.bruger.Aktie\022\r\n\005param\030\002 \001" +
      "(\t\022\017\n\007depotID\030\003 \001(\005\022\r\n\005antal\030\004 \001(\005\"\031\n\tAk",
      "tieName\022\014\n\004name\030\001 \001(\t\"!\n\rAktieResponse\022\020" +
      "\n\010response\030\001 \001(\t\"/\n\tallAktier\022\"\n\006aktier\030" +
      "\001 \003(\0132\022.GRPC.bruger.Aktie\"\035\n\014getAllAktie" +
      "r\022\r\n\005param\030\001 \001(\t2\333\003\n\rBrugerService\022@\n\014cr" +
      "eateBruger\022\023.GRPC.bruger.Bruger\032\033.GRPC.b" +
      "ruger.BrugerResponse\022<\n\tgetBruger\022\032.GRPC" +
      ".bruger.BrugerRequest\032\023.GRPC.bruger.Brug" +
      "er\022D\n\013handleAktie\022\031.GRPC.bruger.AktieReq" +
      "uest\032\032.GRPC.bruger.AktieResponse\022F\n\013logi" +
      "nBruger\022\032.GRPC.bruger.BrugerRequest\032\033.GR",
      "PC.bruger.BrugerResponse\0226\n\010getAktie\022\026.G" +
      "RPC.bruger.AktieName\032\022.GRPC.bruger.Aktie" +
      "\022;\n\006getAll\022\031.GRPC.bruger.getAllAktier\032\026." +
      "GRPC.bruger.allAktier\022G\n\014handleBruger\022\032." +
      "GRPC.bruger.BrugerRequest\032\033.GRPC.bruger." +
      "BrugerResponseB\002P\001b\006proto3"
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
    internal_static_GRPC_bruger_Bruger_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GRPC_bruger_Bruger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_Bruger_descriptor,
        new java.lang.String[] { "Username", "Password", "DepotID", "Saldo", });
    internal_static_GRPC_bruger_BrugerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GRPC_bruger_BrugerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_BrugerResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_GRPC_bruger_BrugerRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GRPC_bruger_BrugerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_BrugerRequest_descriptor,
        new java.lang.String[] { "Bruger", "Param", });
    internal_static_GRPC_bruger_Aktie_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GRPC_bruger_Aktie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_Aktie_descriptor,
        new java.lang.String[] { "Navn", "Firma", "Pris", "High", "Low", });
    internal_static_GRPC_bruger_AktieRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GRPC_bruger_AktieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_AktieRequest_descriptor,
        new java.lang.String[] { "Aktie", "Param", "DepotID", "Antal", });
    internal_static_GRPC_bruger_AktieName_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GRPC_bruger_AktieName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_AktieName_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_GRPC_bruger_AktieResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GRPC_bruger_AktieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_AktieResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_GRPC_bruger_allAktier_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GRPC_bruger_allAktier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_allAktier_descriptor,
        new java.lang.String[] { "Aktier", });
    internal_static_GRPC_bruger_getAllAktier_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GRPC_bruger_getAllAktier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GRPC_bruger_getAllAktier_descriptor,
        new java.lang.String[] { "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
