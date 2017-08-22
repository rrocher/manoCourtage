package com.mano.courtage;

import java.nio.charset.Charset;

import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseTestServer {

	@LocalServerPort
	protected int port;

	protected TestRestTemplate restTemplate = new TestRestTemplate();

	protected HttpHeaders headers = new HttpHeaders();
	
	protected String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}


	protected String createHttpAuthenticationHeaderValue(String userId,
			String password) {

		String auth = userId + ":" + password;

		byte[] encodedAuth = Base64.encode(auth.getBytes(Charset
				.forName("US-ASCII")));

		String headerValue = "Bearer " + new String(encodedAuth);

		return headerValue;
	}
}
