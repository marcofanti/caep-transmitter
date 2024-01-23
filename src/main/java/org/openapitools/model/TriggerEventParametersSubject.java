package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ComplexSubjectApplication;
import org.openapitools.model.ComplexSubjectDevice;
import org.openapitools.model.ComplexSubjectGroup;
import org.openapitools.model.ComplexSubjectOrgUnit;
import org.openapitools.model.ComplexSubjectSession;
import org.openapitools.model.ComplexSubjectTenant;
import org.openapitools.model.ComplexSubjectUser;
import org.openapitools.model.SimpleSubject;
import org.openapitools.model.Subject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TriggerEventParametersSubject
 */


@JsonTypeName("TriggerEventParameters_subject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
public class TriggerEventParametersSubject implements Subject {

  public TriggerEventParametersSubject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TriggerEventParametersSubject(String format, String uri, String url, String email, String iss, String sub, String jti, String id, String phoneNumber, String issuer, String assertionId, List<@Valid SimpleSubject> identifiers) {
//    super(format, identifiers, uri, url, email, iss, sub, jti, id, phoneNumber, issuer, assertionId);
  }


  public TriggerEventParametersSubject format(String format) {
//    super.format(format);
    return this;
  }

  public TriggerEventParametersSubject identifiers(List<@Valid SimpleSubject> identifiers) {
//    super.identifiers(identifiers);
    return this;
  }

  public TriggerEventParametersSubject addIdentifiersItem(SimpleSubject identifiersItem) {
//    super.addIdentifiersItem(identifiersItem);
    return this;
  }

  public TriggerEventParametersSubject application(ComplexSubjectApplication application) {
//    super.application(application);
    return this;
  }

  public TriggerEventParametersSubject device(ComplexSubjectDevice device) {
//    super.device(device);
    return this;
  }

  public TriggerEventParametersSubject group(ComplexSubjectGroup group) {
//    super.group(group);
    return this;
  }

  public TriggerEventParametersSubject orgUnit(ComplexSubjectOrgUnit orgUnit) {
//    super.orgUnit(orgUnit);
    return this;
  }

  public TriggerEventParametersSubject session(ComplexSubjectSession session) {
//    super.session(session);
    return this;
  }

  public TriggerEventParametersSubject tenant(ComplexSubjectTenant tenant) {
//    super.tenant(tenant);
    return this;
  }

  public TriggerEventParametersSubject user(ComplexSubjectUser user) {
//    super.user(user);
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
    sb.append("class TriggerEventParametersSubject {\n");
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

