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
