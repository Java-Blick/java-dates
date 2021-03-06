[![Build Status](https://travis-ci.org/javablick/DateConvert.svg?branch=master)](https://travis-ci.org/javablick/DateConvert)
[![CircleCI](https://circleci.com/gh/javablick/DateConvert/tree/master.svg?style=shield)](https://circleci.com/gh/javablick/DateConvert/tree/master)
[![Coverage Status](https://coveralls.io/repos/github/javablick/DateConvert/badge.svg?branch=master&service=github)](https://coveralls.io/github/javablick/DateConvert?branch=master)
# DateConvert

Simple Java library to convert common Date/Time objects. Use old style Date or Calendar and convert it to new Java 7+ Date/Time objects or visa versa.

Take a `java.time.LocalDate` object, add time and zone and convert it to `java.util.Date` with an one-liner. 

## Usage

Use DateConvert to convert Calendar, Instant, ZonedDateTime and even LocalDate.

For example:
```java
// java.util.Date to Calendar with default zone
DateConvert.from(date).toCalendarWithDefaultZone();

// Calendar to java.time.ZonedDateTime
DateConvert.from(calendar).toZonedDateTime();

// java.time.LocalDate -> java.util.Date with time 12:30 and default zone
DateConvert.from(localDate).withLocalTime(12, 30, 0, 0).withDefaultZoneId().toDate();
```

## Converts from/to
- Calendar
- Date
- Instant
- LocalDate
- LocalDateTime
- Millis
- Timestamp
- ZonedDateTime

## Quickstart

1. Add JitPack repository to your build file, see [here](https://jitpack.io/)
2. Add the DateConvert dependency

For maven the pom.xml looks like
```xml
...
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
...
<dependencies>
	<dependency>
		<groupId>com.github.javablick</groupId>
		<artifactId>dateconvert</artifactId>
		<version>2.0.0</version>
	</dependency>
</dependencies>

```
3. Use the DateConvert class, e.g. `DateConvert.from(date).toCalendar();` 

## Questions? Need help?
Write me an [email](mailto:michael.kosin@java-blick.com?Subject=DateConvert).

See also my [homepage](https://www.java-blick.com).



