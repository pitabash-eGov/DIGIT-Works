package org.egov.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.egov.web.models.AdditionalFields;
import org.egov.web.models.Address;
import org.egov.web.models.AuditDetails;
import org.egov.web.models.Identifier;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

/**
 * A representation of an Individual.
 */
@ApiModel(description = "A representation of an Individual.")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2022-12-08T16:20:57.141+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Individual   {
        @JsonProperty("id")
        private String id = null;

        @JsonProperty("clientReferenceId")
        private String clientReferenceId = null;

        @JsonProperty("name")
        private String name = null;

        @JsonProperty("dateOfBirth")
        private String dateOfBirth = null;

        @JsonProperty("address")
        private Address address = null;

              /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    OTHER("OTHER");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

        @JsonProperty("gender")
        private GenderEnum gender = null;

        @JsonProperty("identifiers")
        @Valid
        private List<Identifier> identifiers = null;

        @JsonProperty("additionalFields")
        private AdditionalFields additionalFields = null;

        @JsonProperty("isDeleted")
        private Boolean isDeleted = null;

        @JsonProperty("rowVersion")
        private Integer rowVersion = null;

        @JsonProperty("auditDetails")
        private AuditDetails auditDetails = null;


        public Individual addIdentifiersItem(Identifier identifiersItem) {
            if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
            }
        this.identifiers.add(identifiersItem);
        return this;
        }

}

