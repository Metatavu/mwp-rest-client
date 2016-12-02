/**
 * manage.kunta-api.dev
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.management.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * The title for the object.
 */
@ApiModel(description = "The title for the object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T14:07:12.652+02:00")
public class PostTitle   {
  @JsonProperty("raw")
  private String raw = null;

  @JsonProperty("rendered")
  private String rendered = null;

  public PostTitle raw(String raw) {
    this.raw = raw;
    return this;
  }

   /**
   * Title for the object, as it exists in the database.
   * @return raw
  **/
  @ApiModelProperty(example = "null", value = "Title for the object, as it exists in the database.")
  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public PostTitle rendered(String rendered) {
    this.rendered = rendered;
    return this;
  }

   /**
   * HTML title for the object, transformed for display.
   * @return rendered
  **/
  @ApiModelProperty(example = "null", value = "HTML title for the object, transformed for display.")
  public String getRendered() {
    return rendered;
  }

  public void setRendered(String rendered) {
    this.rendered = rendered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTitle postTitle = (PostTitle) o;
    return Objects.equals(this.raw, postTitle.raw) &&
        Objects.equals(this.rendered, postTitle.rendered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw, rendered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTitle {\n");
    
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    rendered: ").append(toIndentedString(rendered)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

