package info.paolociccarese.speedclient.client;

import info.paolociccarese.speedapp.core.ASpeedApp;
import info.paolociccarese.speedapp.core.logging.IAppLoggable;
import info.paolociccarese.speedapp.core.logging.ILogger;
import info.paolociccarese.speedapp.core.logging.InMemoryLogger;
import info.paolociccarese.speedapp.core.logging.LogLevel;
import info.paolociccarese.speedapp.core.ui.IAppResources;
import info.paolociccarese.speedapp.core.ui.IResizable;
import info.paolociccarese.speedapp.core.ui.logging.LogListPanel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SpeedClient extends ASpeedApp implements EntryPoint {
	/**
	 * The static images used throughout the Domeo application.
	 */
	public static final IAppResources applicationResources = GWT.create(IAppResources.class);

	public static SpeedClient _app = null;

	protected void parametrize() {
		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), IAppLoggable.LOGGER, InMemoryLogger.class.getName());
		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), ILogger.LOGGING_LEVEL, LogLevel.DEBUG.getValue());
		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), ILogger.LOGGING_PROPAGATION_LEVEL, LogLevel.INFO.getValue());
		getConfigurer().registerPreferenceItemValue(ASpeedApp.class.getName(), LogListPanel.DISPLAY_LEVEL, LogLevel.DEBUG.getValue());
	}
	
	protected void keys() {
		getLogger().info(this, ".customKeys() ... none");
		return;
	}
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		_app = this;
		_app.initialize();

		_app.getLogger().debug(this, "yolo");
	}
	
	@Override
	public ILogger customLoggers(String idLogger) {
		return ILogger.NO_LOGGER;
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
