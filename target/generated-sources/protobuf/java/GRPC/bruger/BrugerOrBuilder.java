// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrugerService.proto

package GRPC.bruger;

public interface BrugerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GRPC.bruger.Bruger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 2;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>int32 depotID = 3;</code>
   */
  int getDepotID();

  /**
   * <code>double saldo = 4;</code>
   */
  double getSaldo();
}
