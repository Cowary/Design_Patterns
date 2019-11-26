package ru.cowary;

public class Main {

    public static void main(String[] args) {
        BackupCloudFacade backupCloudFacade = new BackupCloudFacade();

        backupCloudFacade.sendEncryptFile();
        backupCloudFacade.getEncryptFile();
    }
}
