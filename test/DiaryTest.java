import diary.Diary;
import diary.Gist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    Diary diary;
    @Test
    public void testForDiaryObject(){
        diary = new Diary("username", "password");
        assertNotNull(diary);
    }

    @Test
    public void testDiaryIsLockedByDefault(){
        diary = new Diary("username", "password");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testDiaryCanBeUnlocked(){
        diary = new Diary("username", "password");
        boolean state = diary.isLocked();
        assertTrue(state);
        diary.unLockWithPassword("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testDiaryCanBeLocked(){
        diary = new Diary("username", "password");
         diary.unLockWithPassword("password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.lock());
    }

    @Test
    public void testEntryCanBeCreated(){
        diary = new Diary("username", "password");
        diary.unLockWithPassword("password");
        assertFalse(diary.isLocked());
        diary.createAndAddGist("latest on my blog","So last time,we spoke about");
        assertEquals(1, diary.countNumberOfGists());

    }

    @Test
    public void testEntryCanBeDeleted() {
        diary = new Diary("username", "password");
        diary.unLockWithPassword("password");
        assertFalse(diary.isLocked());
        diary.createAndAddGist("latest on my blog","So last time,we spoke about");
        diary.createAndAddGist("latest ","So we spoke about");
        assertEquals(2, diary.countNumberOfGists());
        diary.delete(2);
        assertEquals(1,diary.countNumberOfGists());

    }

    @Test
    public void EntryCanBeFoundById(){
        diary = new Diary("username", "password");
        diary.unLockWithPassword("password");
        assertFalse(diary.isLocked());
        diary.createAndAddGist("latest","blah blah,blah");
        Gist story = diary.findGistById(1);
        assertEquals(1,story.getId());

    }

    @Test
    public void testDiaryCanBeUpdated() {
        diary = new Diary("username", "password");
        diary.unLockWithPassword("password");
        assertFalse(diary.isLocked());
        diary.createAndAddGist("latest on my blog","So last time,we spoke about");
        diary.updateDiary(1, "my story", "Everyday is a great day");
        Gist one = diary.findGistByBody("Everyday is a great day");
        assertEquals("Everyday is a great day",one.getBody());


    }




















}
