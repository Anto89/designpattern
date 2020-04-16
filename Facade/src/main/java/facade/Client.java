package facade;

public class Client {
    public static void main(String... args) {
        var audioFileNameToUpload = "Flip_Ya_Lid.ogg";
        new AudioUploadingFacade().uploadAudioFile(audioFileNameToUpload);
    }
}
