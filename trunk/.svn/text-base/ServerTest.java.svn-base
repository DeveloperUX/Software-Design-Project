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
public class ServerTest {

    public ServerTest() {
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
     * Test of getUserProfile method when successful by checking whether the the profile retrieved's id
     * matches the id checked for.
     */
    @Test
    public void testSuccessfulGetUserProfile() {
        System.out.println("successfulGetUserProfile");
        String userID = "userID";
        Server instance = new Server();
        UserProfile result = instance.getUserProfile(userID);
        assertEquals("userID", result.getID());
    }

    /**
     * Test of getUserProfile method when unsuccessful by ensuring null is returned.
     */
    @Test
    public void testUnsuccessfulGetUserProfile() {
        System.out.println("unsuccessfulGetUserProfile");
        String userID = "userID";
        Server instance = new Server();
        UserProfile result = instance.getUserProfile(userID);
        assertNull(result);
    }

    /**
     * Test of uploadProfile method when nonNull by ensuring the number of profiles has gone up by 1.
     */
    @Test
    public void testNonNullUploadProfile() {
        System.out.println("nonNullUploadProfile");
        UserProfile profile = new UserProfile();
        Server instance = new Server();
        int expected=instance.getNumUsers();
        instance.uploadProfile(profile);
        assertEquals(expected+1,instance.getNumUsers());
    }

    /**
     * Test of uploadProfile method when a null profile is enterd by ensuring the number of profiles remains the same.
     */
    @Test
    public void testNullUploadProfile() {
        System.out.println("nullUploadProfile");
        UserProfile profile = null;
        Server instance = new Server();
        int expected=instance.getNumUsers();
        instance.uploadProfile(profile);
        assertEquals(expected,instance.getNumUsers());
    }

    /**
     * Test of displayFlaggedPhotos method by ensuring the array sent is not null.
     */
    @Test
    public void testDisplayFlaggedPhotos() {
        System.out.println("displayFlaggedPhotos");
        Server instance = new Server();
        Photo[] result = instance.displayFlaggedPhotos();
        assertNotNull(result);
    }

    /**
     * Test of deleteProfile method by ensuring checking for the profile after deletion results in
     * a null return.
     */
    @Test
    public void testDeleteProfile() {
        System.out.println("deleteProfile");
        String userID = "userID";
        Server instance = new Server();
        instance.deleteProfile(userID);
        assertNull(instance.getUserProfile(userID));
    }

    /**
     * Test of uploadPhoto method when a valid ID and a non-null photo are entered by
     * checking whether the taken album of the uploader has its size incremented by 1.
     */
    @Test
    public void testValidIDNonNullUploadPhoto() {
        System.out.println("ValidIDNonNullUploadPhoto");
        Photo photo = new Photo();
        String userID = "UserID";
        Server instance = new Server();
        int expected=instance.getUserProfile(userID).viewTakenAlbum().getNumPhotos();
        instance.uploadPhoto(photo, userID);
        assertEquals(expected+1,instance.getUserProfile(userID).viewTakenAlbum().getNumPhotos());
    }

    /**
     * Test of uploadPhoto method when a valid ID but a null photo are entered by checking whether the taken album
     * of the uploader has its size remain the same.
     */
    @Test
    public void testValidIDNullUploadPhoto() {
        System.out.println("ValidIDNullUploadPhoto");
        Photo photo = null;
        String userID = "UserID";
        Server instance = new Server();
        int expected=instance.getUserProfile(userID).viewTakenAlbum().getNumPhotos();
        instance.uploadPhoto(photo, userID);
        assertEquals(expected,instance.getUserProfile(userID).viewTakenAlbum().getNumPhotos());
    }

    /**
     * Test of uploadPhoto method with an Invalid ID by checking if there remains no profile
     * of the given ID after a phot attempts to be uploaded, thus ensuring the upload failed
     */
    @Test
    public void testInvalidIDUploadPhoto() {
        System.out.println("InvalidIDUploadPhoto");
        Photo photo = new Photo();
        String userID = "UserID";
        Server instance = new Server();
        instance.uploadPhoto(photo, userID);
        assertNull(instance.getUserProfile(userID));
    }

}