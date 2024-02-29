package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsAboutDeutscheBank() {
    assertThat(queryProcessor.process("Deutsche"), containsString("London"));
  }

  @Test
  public void knowsName() {
    assertThat(queryProcessor.process("Name"), containsString("Ashney"));
  }

  @Test
  public void score1() {
    assertThat(queryProcessor.process("16 plus 72"), containsString("88"));
  }

}
