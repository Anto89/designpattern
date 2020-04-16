package facade;

public class AudioUploader {
    public AudioFile upload(String name) {
        System.out.println(String.format("Uploading %s ...", name));
        return new AudioFile(name);
    }
}
