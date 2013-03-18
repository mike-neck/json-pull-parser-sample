package com.jpp.sample;

import java.io.IOException;
import java.io.InputStream;

import net.vvakame.util.jsonpullparser.JsonFormatException;

import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.is;

public class CustomerTest {

	@Test
	public void simpleJsonData () throws IOException, JsonFormatException {
		ClassLoader loader = getClass().getClassLoader();
		InputStream stream = loader.getResourceAsStream("customer-test-1.json");
		Customer customer = CustomerGen.get(stream);
		assertThat(customer.getFirstName(), is("mike"));
		assertThat(customer.getLastName(), is("neck"));
		assertThat(customer.getAge(), is(35));
		assertThat(customer.getIncome(), is(40 * 100 * 100));
	}
}
