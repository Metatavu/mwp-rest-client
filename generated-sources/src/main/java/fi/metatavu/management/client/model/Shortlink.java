/**
 * localhost
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
import fi.metatavu.management.client.model.PostGuid;
import fi.metatavu.management.client.model.PostTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Shortlink
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T07:22:05.208+02:00")
public class Shortlink   {
  @JsonProperty("date")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime date = null;

  @JsonProperty("date_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime dateGmt = null;

  @JsonProperty("guid")
  private PostGuid guid = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("modified")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modified = null;

  @JsonProperty("modified_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modifiedGmt = null;

  @JsonProperty("slug")
  private String slug = null;

  /**
   * Kohteen nimetty tila.
   */
  public enum StatusEnum {
    PUBLISH("publish"),
    
    FUTURE("future"),
    
    DRAFT("draft"),
    
    PENDING("pending"),
    
    PRIVATE("private"),
    
    EXPIRATION("expiration");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("title")
  private PostTitle title = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("url")
  private String url = null;

  public Shortlink date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Ajankohta kun kohde julkaistiin sivuston aikavyöhykkeen ajassa.
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "Ajankohta kun kohde julkaistiin sivuston aikavyöhykkeen ajassa.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public Shortlink dateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
    return this;
  }

   /**
   * Ajankohta kun kohde julkaistiin GMT-ajassa.
   * @return dateGmt
  **/
  @ApiModelProperty(example = "null", value = "Ajankohta kun kohde julkaistiin GMT-ajassa.")
  public LocalDateTime getDateGmt() {
    return dateGmt;
  }

  public void setDateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
  }

  public Shortlink guid(PostGuid guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostGuid getGuid() {
    return guid;
  }

  public void setGuid(PostGuid guid) {
    this.guid = guid;
  }

  public Shortlink id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Kohteen uniikki tunniste.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Kohteen uniikki tunniste.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Shortlink link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Kohteen URL.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "Kohteen URL.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Shortlink modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Kohteen viimeinen muokkauspäivämäärä sivuston aikavyöhykkeen ajassa.
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "Kohteen viimeinen muokkauspäivämäärä sivuston aikavyöhykkeen ajassa.")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public Shortlink modifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
    return this;
  }

   /**
   * Kohteen viimeinen muokkauspäivämäärä GMT-ajassa.
   * @return modifiedGmt
  **/
  @ApiModelProperty(example = "null", value = "Kohteen viimeinen muokkauspäivämäärä GMT-ajassa.")
  public LocalDateTime getModifiedGmt() {
    return modifiedGmt;
  }

  public void setModifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
  }

  public Shortlink slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Kohteen tyypilleen uniikki alfanumeerinen tunniste.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "Kohteen tyypilleen uniikki alfanumeerinen tunniste.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Shortlink status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Kohteen nimetty tila.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Kohteen nimetty tila.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Shortlink type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Kohteen artikkelityyppi.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Kohteen artikkelityyppi.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Shortlink password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Salasana sisällön ja otteen suojaamiseksi. 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Salasana sisällön ja otteen suojaamiseksi. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Shortlink title(PostTitle title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostTitle getTitle() {
    return title;
  }

  public void setTitle(PostTitle title) {
    this.title = title;
  }

  public Shortlink template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Teematiedosto joka näyttää kohteen.
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "Teematiedosto joka näyttää kohteen.")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Shortlink path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Shortlink path
   * @return path
  **/
  @ApiModelProperty(example = "null", value = "Shortlink path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Shortlink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Shortlink URL
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "Shortlink URL")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shortlink shortlink = (Shortlink) o;
    return Objects.equals(this.date, shortlink.date) &&
        Objects.equals(this.dateGmt, shortlink.dateGmt) &&
        Objects.equals(this.guid, shortlink.guid) &&
        Objects.equals(this.id, shortlink.id) &&
        Objects.equals(this.link, shortlink.link) &&
        Objects.equals(this.modified, shortlink.modified) &&
        Objects.equals(this.modifiedGmt, shortlink.modifiedGmt) &&
        Objects.equals(this.slug, shortlink.slug) &&
        Objects.equals(this.status, shortlink.status) &&
        Objects.equals(this.type, shortlink.type) &&
        Objects.equals(this.password, shortlink.password) &&
        Objects.equals(this.title, shortlink.title) &&
        Objects.equals(this.template, shortlink.template) &&
        Objects.equals(this.path, shortlink.path) &&
        Objects.equals(this.url, shortlink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateGmt, guid, id, link, modified, modifiedGmt, slug, status, type, password, title, template, path, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shortlink {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedGmt: ").append(toIndentedString(modifiedGmt)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

