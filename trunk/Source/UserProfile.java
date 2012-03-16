
import java.awt.Image;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randy
 */
public class UserProfile {
    private String name;
    private String password;
    private String email;
    private int phone;
    private String ID;
    private Image ProfilePicture;
    private Album taggedAlbum;
    private Album takenAlbum;
    public Location location;
    private UserProfile [] contactList;

    public UserProfile() {
        taggedAlbum=new Album();
        takenAlbum=new Album();
        contactList=new UserProfile[10];
    }

    public String getID() {
        return ID;
    }

    public void addPhotoTaken(Photo photo){

    }

    public void addPhotoTagged(Photo photo){

    }

    public void addContact(Tag tag){

    }

    public UserProfile viewContact(String userID) {
        return new UserProfile();
    }

    public void removeContact(String userID) {

    }

    public void updateLocation(Location location) {

    }

    public Album viewTaggedAlbum() {
        return taggedAlbum;
    }

    public Album viewTakenAlbum() {
        return takenAlbum;
    }
}
