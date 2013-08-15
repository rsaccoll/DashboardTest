package com.example.dashboard.test;

import com.example.dashboard.*;
import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;

public class Home_Test extends ActivityInstrumentationTestCase2<HomeActivity>
{
	private Solo solo;
	
	public Home_Test()
	{
		super(HomeActivity.class);
	}
	
	@Override
	public void setUp() throws Exception
	{
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	@Override
	public void tearDown() throws Exception
	{
		solo.finishOpenedActivities();
	}
	
	public void testApp() throws Exception
	{
		solo.clickOnMenuItem("Froyo 2.2");
		Thread.sleep(1000);
		solo.assertCurrentActivity("Deve apresentar a activity:", "Activity_Froyo");
		solo.takeScreenshot();
		solo.goBack();
		Thread.sleep(1000);
		solo.clickOnMenuItem("Eclair 2.0/2.1");
		Thread.sleep(1000);
		solo.assertCurrentActivity("Deve apresentar a activity:", "Activity_Eclair");
		solo.goBack();
		Thread.sleep(1000);
		solo.clickOnMenuItem("Gingerbread 2.3.x");
		Thread.sleep(1000);
		solo.assertCurrentActivity("Deve apresentar a activity:", "Activity_Gingerbread");
		solo.goBack();
		Thread.sleep(1000);
		solo.clickOnMenuItem("Honeycomb 3.x.x");
		Thread.sleep(1000);
		solo.assertCurrentActivity("Deve apresentar a activity:", "Activity_Honeycomb");
		solo.goBack();
		Thread.sleep(1000);
		solo.clickOnMenuItem("ICS 4.0.x");
		Thread.sleep(1000);
		solo.assertCurrentActivity("Deve apresentar a activity:", "Activity_ICS");
		solo.goBack();
		Thread.sleep(1000);
		solo.clickOnMenuItem("JellyBean");
		Thread.sleep(1000);
		solo.assertCurrentActivity("Deve apresentar a activity:", "Activity_JellyBean");
		solo.goBack();
		Thread.sleep(1000);

	}
}
