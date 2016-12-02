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
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * PageRevision
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T14:07:12.652+02:00")
public class PageRevision   {
  @JsonProperty("author")
  private Integer author = null;

  @JsonProperty("date")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime date = null;

  @JsonProperty("date_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime dateGmt = null;

  @JsonProperty("guid")
  private String guid = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("modified")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modified = null;

  @JsonProperty("modified_gmt")
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)  
  @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)  
  private LocalDateTime modifiedGmt = null;

  @JsonProperty("parent")
  private Integer parent = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("excerpt")
  private String excerpt = null;

  public PageRevision author(Integer author) {
    this.author = author;
    return this;
  }

   /**
   * The id for the author of the object.
   * @return author
  **/
  @ApiModelProperty(example = "null", value = "The id for the author of the object.")
  public Integer getAuthor() {
    return author;
  }

  public void setAuthor(Integer author) {
    this.author = author;
  }

  public PageRevision date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date the object was published.
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public PageRevision dateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
    return this;
  }

   /**
   * The date the object was published, as GMT.
   * @return dateGmt
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published, as GMT.")
  public LocalDateTime getDateGmt() {
    return dateGmt;
  }

  public void setDateGmt(LocalDateTime dateGmt) {
    this.dateGmt = dateGmt;
  }

  public PageRevision guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * GUID for the object, as it exists in the database.
   * @return guid
  **/
  @ApiModelProperty(example = "null", value = "GUID for the object, as it exists in the database.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public PageRevision id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for the object.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PageRevision modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date the object was last modified.
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "The date the object was last modified.")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public PageRevision modifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
    return this;
  }

   /**
   * The date the object was last modified, as GMT.
   * @return modifiedGmt
  **/
  @ApiModelProperty(example = "null", value = "The date the object was last modified, as GMT.")
  public LocalDateTime getModifiedGmt() {
    return modifiedGmt;
  }

  public void setModifiedGmt(LocalDateTime modifiedGmt) {
    this.modifiedGmt = modifiedGmt;
  }

  public PageRevision parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The id for the parent of the object.
   * @return parent
  **/
  @ApiModelProperty(example = "null", value = "The id for the parent of the object.")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public PageRevision slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the object unique to its type.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "An alphanumeric identifier for the object unique to its type.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public PageRevision title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title for the object, as it exists in the database.
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "Title for the object, as it exists in the database.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PageRevision content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content for the object, as it exists in the database.
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "Content for the object, as it exists in the database.")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PageRevision excerpt(String excerpt) {
    this.excerpt = excerpt;
    return this;
  }

   /**
   * Excerpt for the object, as it exists in the database.
   * @return excerpt
  **/
  @ApiModelProperty(example = "null", value = "Excerpt for the object, as it exists in the database.")
  public String getExcerpt() {
    return excerpt;
  }

  public void setExcerpt(String excerpt) {
    this.excerpt = excerpt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRevision pageRevision = (PageRevision) o;
    return Objects.equals(this.author, pageRevision.author) &&
        Objects.equals(this.date, pageRevision.date) &&
        Objects.equals(this.dateGmt, pageRevision.dateGmt) &&
        Objects.equals(this.guid, pageRevision.guid) &&
        Objects.equals(this.id, pageRevision.id) &&
        Objects.equals(this.modified, pageRevision.modified) &&
        Objects.equals(this.modifiedGmt, pageRevision.modifiedGmt) &&
        Objects.equals(this.parent, pageRevision.parent) &&
        Objects.equals(this.slug, pageRevision.slug) &&
        Objects.equals(this.title, pageRevision.title) &&
        Objects.equals(this.content, pageRevision.content) &&
        Objects.equals(this.excerpt, pageRevision.excerpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, date, dateGmt, guid, id, modified, modifiedGmt, parent, slug, title, content, excerpt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRevision {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedGmt: ").append(toIndentedString(modifiedGmt)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
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

