package com.example.powerup.test;

import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.example.powerup.DatabaseHandler;
import com.example.powerup.Game;
import com.example.powerup.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class GameTest extends
		ActivityInstrumentationTestCase2<Game> {

	public static String QuestionIFile = "QuestionIncorrectFile.csv";
	public static String AnswerIFile = "AnswerIncorrectFile.csv";
	public static String ScenarioIFile = "ScenarioIncorrectFile.csv";
	
	private Game game;
	private DatabaseHandler mDbHandlerTest;

	public GameTest(Class<Game> activityClass) {
		super(activityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		game = getActivity();		
	}
	
	@Test
	protected void testReadCSVQuestion() {
		mDbHandlerTest = game.getmDbHandler();
		try {
			mDbHandlerTest.readCSVQuestion(QuestionIFile);
			fail("ReadCSVQuestionTest Failed. The file format is correct");
		} catch (IOException e){
			fail("ReadCSVQuestionTest Failed: File not found");
		} catch (Error e) {
			assertTrue(e.getMessage().contains("Incorrect Question CSV"));
		}  
	}
	
	@Test
	protected void testReadCSVAnswer() {
		mDbHandlerTest = game.getmDbHandler();
		try {
			mDbHandlerTest.readCSVQuestion(QuestionIFile);
			fail("ReadCSVAnswerTest Failed. The file format is correct");
		} catch (IOException e){
			fail("ReadCSVAnswerTest Failed: File not found");
		} catch (Error e) {
			assertTrue(e.getMessage().contains("Incorrect Answer CSV"));
		}  
	}
	
	@Test
	protected void testReadCSVScenario() {
		mDbHandlerTest = game.getmDbHandler();
		try {
			mDbHandlerTest.readCSVQuestion(QuestionIFile);
			fail("ReadCSVScenarioTest Failed. The file format is correct");
		} catch (IOException e){
			fail("ReadCSVScenarioTest Failed: File not found");
		} catch (Error e) {
			assertTrue(e.getMessage().contains("Incorrect Scenario CSV"));
		}  
	}
}
