// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrugerService.proto

package GRPC.bruger;

public interface AktieRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GRPC.bruger.AktieRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .GRPC.bruger.Aktie aktie = 1;</code>
   */
  java.util.List<GRPC.bruger.Aktie> 
      getAktieList();
  /**
   * <code>repeated .GRPC.bruger.Aktie aktie = 1;</code>
   */
  GRPC.bruger.Aktie getAktie(int index);
  /**
   * <code>repeated .GRPC.bruger.Aktie aktie = 1;</code>
   */
  int getAktieCount();
  /**
   * <code>repeated .GRPC.bruger.Aktie aktie = 1;</code>
   */
  java.util.List<? extends GRPC.bruger.AktieOrBuilder> 
      getAktieOrBuilderList();
  /**
   * <code>repeated .GRPC.bruger.Aktie aktie = 1;</code>
   */
  GRPC.bruger.AktieOrBuilder getAktieOrBuilder(
      int index);

  /**
   * <code>string param = 2;</code>
   */
  java.lang.String getParam();
  /**
   * <code>string param = 2;</code>
   */
  com.google.protobuf.ByteString
      getParamBytes();

  /**
   * <code>int32 depotID = 3;</code>
   */
  int getDepotID();

  /**
   * <code>int32 antal = 4;</code>
   */
  int getAntal();
}
