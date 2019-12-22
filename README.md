# Enum-deserialization-using-JsonValue-
Enum deserialization using @JsonValue does not works for int values. It is using Index value instead of actual value

Spring Boot 2 + jackson Enum deserialization  does not work correclty for integr values. For interger values to work correcly we need to add   `@JsonCreator` along with `@JsonValue`


  


