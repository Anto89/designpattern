package facade;

public class AudioUploadingFacade {
    private AudioUploader audioUploader = new AudioUploader();
    private AudioConverter audioConverter = new AudioConverter();
    private AudioCompresser audioCompresser = new AudioCompresser();

    public void uploadAudioFile(String name) {
        AudioFile uploaded = audioUploader.upload(name);
        audioConverter.convert(uploaded);
        audioCompresser.compress(uploaded);
        System.out.println("Done !");
    }
}
