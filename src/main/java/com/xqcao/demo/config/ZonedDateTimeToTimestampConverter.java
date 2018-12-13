package com.xqcao.demo.config;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

@SuppressWarnings("unused")
@Converter(autoApply = true)
public class ZonedDateTimeToTimestampConverter implements AttributeConverter<ZonedDateTime, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(ZonedDateTime entityValue) {
        if (Objects.isNull(entityValue)) {
            return null;
        }
        return Timestamp.valueOf(entityValue.toLocalDateTime().truncatedTo(ChronoUnit.SECONDS));
    }

    @Override
    public ZonedDateTime convertToEntityAttribute(Timestamp databaseValue) {
        if (Objects.isNull(databaseValue)) {
            return null;
        }
        return ZonedDateTime.ofInstant(databaseValue.toInstant(), ZoneId.systemDefault());
    }

}
