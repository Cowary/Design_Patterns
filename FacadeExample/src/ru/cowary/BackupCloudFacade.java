package ru.cowary;

public class BackupCloudFacade {
    FileManager fileManager;
    Network network;
    Security security;

    BackupCloudFacade(){
        fileManager = new FileManager();
        network = new Network();
        security = new Security();
    }
    public void sendEncryptFile(){
        String name = fileManager.readName();
        byte[] mes = fileManager.readFile();
        mes = security.encryptByte(mes);
        network.sendByte(mes, name);
    }
    public void getEncryptFile(){
        byte[] mes = network.getByte(fileManager.writeName());
        mes = security.decryptByte(mes);
        fileManager.writeFile(mes);
    }
}
