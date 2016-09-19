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


package fi.otavanopisto.mwp.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Status
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-19T13:15:17.958+03:00")
public class Status   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("private")
  private Boolean _private = null;

  @JsonProperty("protected")
  private Boolean _protected = null;

  @JsonProperty("public")
  private Boolean _public = null;

  @JsonProperty("queryable")
  private Boolean queryable = null;

  @JsonProperty("show_in_list")
  private Boolean showInList = null;

  @JsonProperty("slug")
  private String slug = null;

  public Status name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The title for the resource.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The title for the resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Status _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether posts with this resource should be private.
   * @return _private
  **/
  @ApiModelProperty(example = "null", value = "Whether posts with this resource should be private.")
  public Boolean getPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public Status _protected(Boolean _protected) {
    this._protected = _protected;
    return this;
  }

   /**
   * Whether posts with this resource should be protected.
   * @return _protected
  **/
  @ApiModelProperty(example = "null", value = "Whether posts with this resource should be protected.")
  public Boolean getProtected() {
    return _protected;
  }

  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }

  public Status _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Whether posts of this resource should be shown in the front end of the site.
   * @return _public
  **/
  @ApiModelProperty(example = "null", value = "Whether posts of this resource should be shown in the front end of the site.")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public Status queryable(Boolean queryable) {
    this.queryable = queryable;
    return this;
  }

   /**
   * Whether posts with this resource should be publicly-queryable.
   * @return queryable
  **/
  @ApiModelProperty(example = "null", value = "Whether posts with this resource should be publicly-queryable.")
  public Boolean getQueryable() {
    return queryable;
  }

  public void setQueryable(Boolean queryable) {
    this.queryable = queryable;
  }

  public Status showInList(Boolean showInList) {
    this.showInList = showInList;
    return this;
  }

   /**
   * Whether to include posts in the edit listing for their post type.
   * @return showInList
  **/
  @ApiModelProperty(example = "null", value = "Whether to include posts in the edit listing for their post type.")
  public Boolean getShowInList() {
    return showInList;
  }

  public void setShowInList(Boolean showInList) {
    this.showInList = showInList;
  }

  public Status slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the resource.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "An alphanumeric identifier for the resource.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.name, status.name) &&
        Objects.equals(this._private, status._private) &&
        Objects.equals(this._protected, status._protected) &&
        Objects.equals(this._public, status._public) &&
        Objects.equals(this.queryable, status.queryable) &&
        Objects.equals(this.showInList, status.showInList) &&
        Objects.equals(this.slug, status.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, _private, _protected, _public, queryable, showInList, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    queryable: ").append(toIndentedString(queryable)).append("\n");
    sb.append("    showInList: ").append(toIndentedString(showInList)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

