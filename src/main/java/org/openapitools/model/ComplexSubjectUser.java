package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.SimpleSubject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ComplexSubjectUser
 */


@JsonTypeName("ComplexSubject_user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
public class ComplexSubjectUser implements SimpleSubject {

  public ComplexSubjectUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ComplexSubjectUser(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId) {
//    super(format, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public ComplexSubjectUser format(String format) {
//    super.format(format);
    return this;
  }

  public ComplexSubjectUser uri(String uri) {
//    super.uri(uri);
    return this;
  }

  public ComplexSubjectUser url(String url) {
//    super.url(url);
    return this;
  }

  public ComplexSubjectUser email(String email) {
//    super.email(email);
    return this;
  }

  public ComplexSubjectUser iss(String iss) {
//    super.iss(iss);
    return this;
  }

  public ComplexSubjectUser sub(String sub) {
//    super.sub(sub);
    return this;
  }

  public ComplexSubjectUser jti(String jti) {
//    super.jti(jti);
    return this;
  }

  public ComplexSubjectUser id(String id) {
//    super.id(id);
    return this;
  }

  public ComplexSubjectUser phoneNumber(String phoneNumber) {
//    super.phoneNumber(phoneNumber);
    return this;
  }

  public ComplexSubjectUser issuer(String issuer) {
//    super.issuer(issuer);
    return this;
  }

  public ComplexSubjectUser assertionId(String assertionId) {
//    super.assertionId(assertionId);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexSubjectUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  @Override
  public String getFormat() {
    return null;
  }
}

