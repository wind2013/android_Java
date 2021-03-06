/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/zhouhao2/myGit/android_Java/Android/AidlDemoASComplexed/app/src/main/aidl/com/archermind/aidl/IGlobalKeyMonitor.aidl
 */
package com.archermind.aidl;
public interface IGlobalKeyMonitor extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.archermind.aidl.IGlobalKeyMonitor
{
private static final java.lang.String DESCRIPTOR = "com.archermind.aidl.IGlobalKeyMonitor";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.archermind.aidl.IGlobalKeyMonitor interface,
 * generating a proxy if needed.
 */
public static com.archermind.aidl.IGlobalKeyMonitor asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.archermind.aidl.IGlobalKeyMonitor))) {
return ((com.archermind.aidl.IGlobalKeyMonitor)iin);
}
return new com.archermind.aidl.IGlobalKeyMonitor.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_processKeysByFlag:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _arg1;
_arg1 = data.readInt();
int[] _arg2;
_arg2 = data.createIntArray();
this.processKeysByFlag(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_restoreKeys:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.restoreKeys(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.archermind.aidl.IGlobalKeyMonitor
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void processKeysByFlag(android.os.IBinder b, int action, int[] keys) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(b);
_data.writeInt(action);
_data.writeIntArray(keys);
mRemote.transact(Stub.TRANSACTION_processKeysByFlag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void restoreKeys(android.os.IBinder b) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(b);
mRemote.transact(Stub.TRANSACTION_restoreKeys, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_processKeysByFlag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_restoreKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void processKeysByFlag(android.os.IBinder b, int action, int[] keys) throws android.os.RemoteException;
public void restoreKeys(android.os.IBinder b) throws android.os.RemoteException;
}
