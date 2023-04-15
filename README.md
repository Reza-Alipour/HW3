در تصویر زیر میزان پوشش کد در ابتدا مشخص شده است.

![coverage1](pictures/coverage1.jpg)

در تصویر زیر میزان پوشش کد بعد از نوشتن تست‌های جدید نشان داده شده است.

![coverage2](pictures/coverage2.jpg)

همانطور که مشخص است میازن پوشش توابع و به دنبال آن خطوط کد به ازای همه‌ی کلاس‌ها افزایش پیدا کرده است.
در ادامه به بررسی هر کلاس و تابع مربوط به آن می‌پردازیم. در ادامه 6 تابع آورده شده است.

![test1](pictures/test1.jpg)
![test2](pictures/test2.jpg)

تابع testJSONIntArray از کلاس JSONArray تابع toJSONString و به دنبال آن writeJSONString را صدا میزند. بنابراین پوشش کلاس JSONArray افزایش می‌یابد.

![json array](pictures/jsonArray.jpg)

تابع testMapToString از کلاس JSONObject تابع toJSONString با ورودی map را صدا می‌زند. بنابراین پوشش آن افزایش می‌یابد.

![json object](pictures/jsonObject.jpg)

تابع testIntToString از کلاس JSONValue تابع toJSONString را صدا می‌زند. بنابراین پوشش این کلاس افزایش می‌یابد.

![json value](pictures/jsonValue.jpg)

تابع testParseBrace از کلاس JSONParser قسمت‌های زیر که مربوط به پارس براکت هستند را پوشش می‌دهد. در تصویر زیر ای تکه کد مشخص است.
![json parser](pictures/Yytoken.jpg)

تابع testParseException از کلاس ParseException تابع ParseException را صدا می‌زند.

![exception](pictures/exception.jpg)

تابع testYytoken از کلاس Yytoken تابع toString را صدا می‌زند.

![Yytoken](pictures/parser.jpg)

