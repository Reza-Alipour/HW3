/*
 * $Id: Test.java,v 1.1 2006/04/15 14:40:06 platform Exp $
 * Created on 2006-4-15
 */
package org.json.simple;

import org.json.simple.parser.Yytoken;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestJson {

    @Test
    public void testDecode() throws Exception {
        System.out.println("=======decode=======");

        String s = "[0,10]";
        Object obj = JSONValue.parse(s);
        JSONArray array = (JSONArray) obj;
        System.out.println("======the 2nd element of array======");
        System.out.println(array.get(1));
        System.out.println();
        assertEquals("10", array.get(1).toString());
    }

    @Test
    public void testJSONArrayCollection() {
        final ArrayList<String> testList = new ArrayList<String>();
        testList.add("First item");
        testList.add("Second item");
        final JSONArray jsonArray = new JSONArray(testList);

        assertEquals("[\"First item\",\"Second item\"]", jsonArray.toJSONString());
    }

    @Test
    public void testJSONIntArray() {
        final int testList[] = new int[2];
        testList[0] = 10;
        testList[1] = 20;
        final String jsonString = JSONArray.toJSONString(testList);
        assertEquals("[10,20]", jsonString);
    }

    @Test
    public void testMapToString() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("reza", "python");
        jsonObject.put("mohammad", "java");
        assertEquals("{\"mohammad\":\"java\",\"reza\":\"python\"}", jsonObject.toJSONString());
    }

    @Test
    public void testIntToString() {
        final int i = 10;
        final String jsonString = JSONValue.toJSONString(i);
        assertEquals("10", jsonString);
    }

    @Test
    public void testParseBrace() {
        final String jsonString = "{\"mohammad\":\"java\",\"reza\":\"python\"}";
        final Object obj = JSONValue.parse(jsonString);
        final JSONObject jsonObject = (JSONObject) obj;
        assertEquals("java", jsonObject.get("mohammad"));
        assertEquals("python", jsonObject.get("reza"));
    }

    @Test
    public void testParseException() {
        final String jsonString = "{reza";
        try {
            JSONValue.parse(jsonString);
        } catch (final Exception e) {
            assertEquals("Unexpected character (r) at position 1.", e.getMessage());
        }
    }

    @Test
    public void testYytoken() {
        final Yytoken yytoken = new Yytoken(0, "test");
        assertEquals("VALUE(test)", yytoken.toString());
    }
}
