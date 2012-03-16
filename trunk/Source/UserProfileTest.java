/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randy
 */
public class UserProfileTest {

    public UserProfileTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getID method by checking if the ID matches a given id.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        UserProfile instance = new UserProfile();
        String expResult = "UserID";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPhotoTaken method when a null photo is added by ensuring the
     * size of the taken album stays the same
     */
    @Test
    public void testNullAddPhotoTaken() {
        System.out.println("nullAddPhotoTaken");
        Photo photo = null;
        UserProfile instance = new UserProfile();
        int startnumber=instance.viewTakenAlbum().getNumPhotos();
        instance.addPhotoTaken(photo);
        assertEquals(startnumber,instance.viewTaggedAlbum().getNumPhotos());
        //Establish number of photos has not changed
    }

    /**
     * Test of addPhotoTaken method when a non null photo is added by ensuring
     * the size of the taken album goes up by 1
     */
    @Test
    public void testNonNullAddPhotoTaken() {
        System.out.println("nonNullAddPhotoTaken");
        Photo photo = new Photo();
        UserProfile instance = new UserProfile();
        int startnumber=instance.viewTakenAlbum().getNumPhotos();
        instance.addPhotoTaken(photo);
        assertEquals(startnumber+1,instance.viewTakenAlbum().getNumPhotos());
        //Establish number of photos has increased by 1
    }

    /**
     * Test of addPhotoTagged method when a null photo is added by ensuring
     * the size of the tagged album stays the same
     */
    @Test
    public void testNullAddPhotoTagged() {
        System.out.println("nullAddPhotoTagged");
        Photo photo = null;
        UserProfile instance = new UserProfile();
        int startnumber=instance.viewTaggedAlbum().getNumPhotos();
        instance.addPhotoTagged(photo);
        assertEquals(startnumber,instance.viewTaggedAlbum().getNumPhotos());
        //Establish number of photos has not changed
    }

    /**
     * Test of addPhotoTagged method when a non null photo is added by ensuring
     * the size of the tagged album goes up by 1
     */
    @Test
    public void testNonNullAddPhotoTagged() {
        System.out.println("nonNullAddPhotoTagged");
        Photo photo = new Photo();
        UserProfile instance = new UserProfile();
        int startnumber=instance.viewTaggedAlbum().getNumPhotos();
        instance.addPhotoTagged(photo);
        assertEquals(startnumber+1,instance.viewTaggedAlbum().getNumPhotos());
        //Establish number of photos has increased by 1
    }

    /**
     * Test of addContact method when successful by checking if the face in the tag's id
     * matches the id of a contact in the contact list after adding
     */
    @Test
    public void testSuccessfulAddContact() {
        System.out.println("successfulAddContact");
        Tag tag=new Tag();
        UserProfile instance = new UserProfile();
        instance.addContact(tag);
        assertEquals(tag.recognizeFace(),instance.viewContact(tag.recognizeFace()).getID());
    }

    /**
     * Test of addContact method when unsuccessful by ensuring there is no contact
     * with any face recognized in the tag in the contact list.
     */
    @Test
    public void testUnuccessfulAddContact() {
        System.out.println("unsuccessfulAddContact");
        Tag tag=new Tag();
        UserProfile instance = new UserProfile();
        instance.addContact(tag);
        assertNull(instance.viewContact(tag.recognizeFace()));
    }

    /**
     * Test of viewContact method when successful by checking if a contact in
     * the contact list matches the given id
     */
    @Test
    public void testSuccessfulViewContact() {
        System.out.println("successfulViewContact");
        String userID = "ContactID";
        UserProfile instance = new UserProfile();
        UserProfile result = instance.viewContact(userID);
        assertEquals("ContactID", result.getID());
    }

    /**
     * Test of viewContact method when unsuccessful by ensuring null is returned
     * when n id match is found
     */
    @Test
    public void testUnsuccessfulViewContact() {
        System.out.println("unsuccessfulViewContact");
        String userID = "ContactID";
        UserProfile instance = new UserProfile();
        assertNull(instance.viewContact(userID));
    }

    /**
     * Test of removeContact method by ensuring after removal no contact matches the
     * given id in the contact list
     */
    @Test
    public void testRemoveContact() {
        System.out.println("removeContact");
        String name = "contactID";
        UserProfile instance = new UserProfile();
        instance.removeContact(name);
        assertNull(instance.viewContact(name));
    }

    /**
     * Test of updateLocation method when non null by ensuring the current location is updated
     * to the given location
     */
    @Test
    public void testNonNullUpdateLocation() {
        System.out.println("nonNullUpdateLocation");
        Location location = new Location();
        UserProfile instance = new UserProfile();
        instance.updateLocation(location);
        assertEquals(location,instance.location);
    }

    /**
     * Test of updateLocation method when null by ensuring the location has not changed to null to match the input.
     */
    @Test
    public void testNullUpdateLocation() {
        System.out.println("nullUpdateLocation");
        Location location = null;
        UserProfile instance = new UserProfile();
        instance.updateLocation(location);
        assertNotNull(instance.location);
    }

    /**
     * Test of viewTaggedAlbum method by ensuring a null value is not returned as their should always be an album
     */
    @Test
    public void testViewTaggedAlbum() {
        System.out.println("viewTaggedAlbum");
        UserProfile instance = new UserProfile();
        assertNotNull(instance.viewTaggedAlbum());
    }

    /**
     * Test of viewTakenAlbum method by ensuring a null value is not returned as their should always be an album
     */
    @Test
    public void testViewTakenAlbum() {
        System.out.println("viewTakenAlbum");
        UserProfile instance = new UserProfile();
        assertNotNull(instance.viewTakenAlbum());
    }

}