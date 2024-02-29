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

  // Which of the following numbers is the largest: 18, 91, 83?
  @Test
  public void score2() {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 18, 91, 83?"), containsString("91"));
  }
  // 	Which of the following numbers is the largest: 64, 77, 60?	-10	14:11:22
  @Test
  public void score3() {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 64, 77, 60?"), containsString("77"));
  }

  //INCORRECT
  //8ac12a49	What is 26 plus 98?	-2.5	14:11:10

  @Test
  public void score4() {
    assertThat(queryProcessor.process("What is 26 plus 98?"), containsString("124"));
  }
  //INCORRECT
  //072d8214	Which of the following numbers is the largest: 76, 39, 48?	-13.333333333333334	14:10:59

  @Test
  public void score5() {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 76, 39, 48?"), containsString("76"));
  }

  // Which of the following numbers is the largest: 7, 50, 63?
  @Test
  public void score6() {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 7, 50, 63?"), containsString("63"));
  }

  // Which of the following numbers is the largest: 66, 42, 37?

  // Which of the following numbers is the largest: 59, 43, 54?

  // Which of the following numbers is the largest: 68, 16, 34?

  // Which of the following numbers is the largest: 94, 76, 33?

}
