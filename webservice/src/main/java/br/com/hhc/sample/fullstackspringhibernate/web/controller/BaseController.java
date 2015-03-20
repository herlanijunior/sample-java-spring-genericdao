package br.com.hhc.sample.fullstackspringhibernate.web.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class BaseController {

	protected final Map<String, String> getRequestorInformation(HttpServletRequest request) {
		return new HashMap<String, String>();
	}

	protected final boolean canAccessService(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		return true;
		
	}

	private static DateTimeFormatter dateFormater = DateTimeFormat.forPattern("E, d MMM y HH:mm:ss Z");

	protected final void setCacheInformationInHeader(final HttpServletResponse response, final int expirationDays) {
		if (expirationDays <= 0) {
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
		}

		final Calendar cal = Calendar.getInstance();
		response.setHeader("Last-Modified",
				BaseController.dateFormater.withZone(DateTimeZone.UTC).print(cal.getTimeInMillis()));

		cal.add(Calendar.DAY_OF_MONTH, expirationDays);

		response.setDateHeader("Expires", cal.getTime().getTime());
		response.setHeader("Expires",
				BaseController.dateFormater.withZone(DateTimeZone.UTC).print(cal.getTimeInMillis()));
	}
}
