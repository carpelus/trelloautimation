package com.ozanunlu.utils;

import org.apache.logging.log4j.Logger;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestMethodLogging extends TestWatcher {
	private Logger LOGGER = null;

	public TestMethodLogging(Logger LOGGER) {
		this.LOGGER = LOGGER;
	}

	@Override
	protected void succeeded(final Description description) {
		System.out.println(description);
		LOGGER.info(String.format("Success: %s", description));
	}

	@Override
	protected void failed(final Throwable e, final Description description) {
		System.out.println(description);
		LOGGER.info(String.format("Failed: %s", description), e);
	}

	@Override
	protected void starting(final Description description) {
		super.starting(description);
		LOGGER.info(String.format("Starting: %s", description));
	}

	@Override
	protected void finished(final Description description) {

		LOGGER.info(String.format("Finished: %s", description));
	}
}
