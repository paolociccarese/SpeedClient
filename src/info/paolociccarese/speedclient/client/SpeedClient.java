package info.paolociccarese.speedclient.client;

import info.paolociccarese.speedapp.core.ASpeedApp;
import info.paolociccarese.speedapp.core.ui.IAppResources;
import info.paolociccarese.speedapp.core.ui.IResizable;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.logging.client.LogConfiguration;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SpeedClient extends ASpeedApp implements EntryPoint {
	/**
	 * The static images used throughout the Domeo application.
	 */
	public static final IAppResources applicationResources = GWT.create(IAppResources.class);
	private static Logger logger = Logger.getLogger("info.paolociccarese.speedclient.client.SpeedClient");

	public static SpeedClient _app = null;

	protected void parametrize() {
		//getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), IAppLoggable.LOGGER, InMemoryLogger.class.getName());
//		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), ILogger.LOGGING_LEVEL, LogLevel.DEBUG.getValue());
//		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), ILogger.LOGGING_PROPAGATION_LEVEL, LogLevel.INFO.getValue());
//		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), LogListPanel.DISPLAY_LEVEL, LogLevel.DEBUG.getValue());
		logger.info(".parametrize() ... none");
	}
	
	protected void keys() {
		logger.info(".customKeys() ... none");
		return;
	}
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		_app = this;
		_app.initialize("SpeedClient");
		
		long startTime = System.currentTimeMillis();
		if (LogConfiguration.loggingIsEnabled()) {
			log().jobStart("Bootstrapping", "Bootstrapping application");
		}
		
		// Bootstrapping
		
		if (LogConfiguration.loggingIsEnabled()) {
			log().jobEnd("Bootstrapping", "Application ready", startTime);
		}
	}

	@Override
	public void addResizeListener(IResizable widget) {
		Window.alert("addResizeListener");
		// TODO Auto-generated method stub		
	}

	@Override
	public void removeResizeListener(IResizable widget) {
		Window.alert("removeResizeListener");
		// TODO Auto-generated method stub	
	}

	@Override
	public void hide() {
		Window.alert("hide");
		// TODO Auto-generated method stub	
	}
}
