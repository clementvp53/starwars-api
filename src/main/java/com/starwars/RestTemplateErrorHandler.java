package com.starwars;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import com.starwards.exceptions.ResourceNotFoundException;
import com.starwards.exceptions.UnExpectedHttpException;

public class RestTemplateErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return response.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
				|| response.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR;
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
			throw new ResourceNotFoundException();
		}
		throw new UnExpectedHttpException(response.getStatusCode());

	}

}
