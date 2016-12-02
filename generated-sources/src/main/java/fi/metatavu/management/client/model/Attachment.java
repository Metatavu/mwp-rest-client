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
import fi.metatavu.management.client.model.PostGuid;
import fi.metatavu.management.client.model.PostTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Attachment
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-02T14:12:08.234+02:00")
public class Attachment   {
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

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("slug")
  private String slug = null;

  /**
   * A named status for the object.
   */
  public enum StatusEnum {
    PUBLISH("publish"),
    
    FUTURE("future"),
    
    DRAFT("draft"),
    
    PENDING("pending"),
    
    PRIVATE("private");

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

  @JsonProperty("title")
  private PostTitle title = null;

  @JsonProperty("author")
  private Integer author = null;

  /**
   * Whether or not comments are open on the object.
   */
  public enum CommentStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    CommentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CommentStatusEnum fromValue(String text) {
      for (CommentStatusEnum b : CommentStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("comment_status")
  private CommentStatusEnum commentStatus = null;

  /**
   * Whether or not the object can be pinged.
   */
  public enum PingStatusEnum {
    OPEN("open"),
    
    CLOSED("closed");

    private String value;

    PingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PingStatusEnum fromValue(String text) {
      for (PingStatusEnum b : PingStatusEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("ping_status")
  private PingStatusEnum pingStatus = null;

  @JsonProperty("alt_text")
  private String altText = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Type of resource.
   */
  public enum MediaTypeEnum {
    IMAGE("image"),
    
    FILE("file");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("media_type")
  private MediaTypeEnum mediaType = null;

  @JsonProperty("mime_type")
  private String mimeType = null;

  @JsonProperty("media_details")
  private Object mediaDetails = null;

  @JsonProperty("post")
  private Integer post = null;

  @JsonProperty("source_url")
  private String sourceUrl = null;

  public Attachment date(LocalDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * The date the object was published, in the site's timezone.
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "The date the object was published, in the site's timezone.")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public Attachment dateGmt(LocalDateTime dateGmt) {
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

  public Attachment guid(PostGuid guid) {
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

  public Attachment id(Integer id) {
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

  public Attachment link(String link) {
    this.link = link;
    return this;
  }

   /**
   * URL to the object.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "URL to the object.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Attachment modified(LocalDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date the object was last modified, in the site's timezone.
   * @return modified
  **/
  @ApiModelProperty(example = "null", value = "The date the object was last modified, in the site's timezone.")
  public LocalDateTime getModified() {
    return modified;
  }

  public void setModified(LocalDateTime modified) {
    this.modified = modified;
  }

  public Attachment modifiedGmt(LocalDateTime modifiedGmt) {
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

  public Attachment password(String password) {
    this.password = password;
    return this;
  }

   /**
   * A password to protect access to the post.
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "A password to protect access to the post.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Attachment slug(String slug) {
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

  public Attachment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * A named status for the object.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "A named status for the object.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Attachment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Post for the object.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of Post for the object.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Attachment title(PostTitle title) {
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

  public Attachment author(Integer author) {
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

  public Attachment commentStatus(CommentStatusEnum commentStatus) {
    this.commentStatus = commentStatus;
    return this;
  }

   /**
   * Whether or not comments are open on the object.
   * @return commentStatus
  **/
  @ApiModelProperty(example = "null", value = "Whether or not comments are open on the object.")
  public CommentStatusEnum getCommentStatus() {
    return commentStatus;
  }

  public void setCommentStatus(CommentStatusEnum commentStatus) {
    this.commentStatus = commentStatus;
  }

  public Attachment pingStatus(PingStatusEnum pingStatus) {
    this.pingStatus = pingStatus;
    return this;
  }

   /**
   * Whether or not the object can be pinged.
   * @return pingStatus
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the object can be pinged.")
  public PingStatusEnum getPingStatus() {
    return pingStatus;
  }

  public void setPingStatus(PingStatusEnum pingStatus) {
    this.pingStatus = pingStatus;
  }

  public Attachment altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Alternative text to display when resource is not displayed.
   * @return altText
  **/
  @ApiModelProperty(example = "null", value = "Alternative text to display when resource is not displayed.")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public Attachment caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * The caption for the resource.
   * @return caption
  **/
  @ApiModelProperty(example = "null", value = "The caption for the resource.")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description for the resource.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description for the resource.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Type of resource.
   * @return mediaType
  **/
  @ApiModelProperty(example = "null", value = "Type of resource.")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public Attachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime type of resource.
   * @return mimeType
  **/
  @ApiModelProperty(example = "null", value = "Mime type of resource.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Attachment mediaDetails(Object mediaDetails) {
    this.mediaDetails = mediaDetails;
    return this;
  }

   /**
   * Details about the resource file, specific to its type.
   * @return mediaDetails
  **/
  @ApiModelProperty(example = "null", value = "Details about the resource file, specific to its type.")
  public Object getMediaDetails() {
    return mediaDetails;
  }

  public void setMediaDetails(Object mediaDetails) {
    this.mediaDetails = mediaDetails;
  }

  public Attachment post(Integer post) {
    this.post = post;
    return this;
  }

   /**
   * The id for the associated post of the resource.
   * @return post
  **/
  @ApiModelProperty(example = "null", value = "The id for the associated post of the resource.")
  public Integer getPost() {
    return post;
  }

  public void setPost(Integer post) {
    this.post = post;
  }

  public Attachment sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * URL to the original resource file.
   * @return sourceUrl
  **/
  @ApiModelProperty(example = "null", value = "URL to the original resource file.")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.date, attachment.date) &&
        Objects.equals(this.dateGmt, attachment.dateGmt) &&
        Objects.equals(this.guid, attachment.guid) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.link, attachment.link) &&
        Objects.equals(this.modified, attachment.modified) &&
        Objects.equals(this.modifiedGmt, attachment.modifiedGmt) &&
        Objects.equals(this.password, attachment.password) &&
        Objects.equals(this.slug, attachment.slug) &&
        Objects.equals(this.status, attachment.status) &&
        Objects.equals(this.type, attachment.type) &&
        Objects.equals(this.title, attachment.title) &&
        Objects.equals(this.author, attachment.author) &&
        Objects.equals(this.commentStatus, attachment.commentStatus) &&
        Objects.equals(this.pingStatus, attachment.pingStatus) &&
        Objects.equals(this.altText, attachment.altText) &&
        Objects.equals(this.caption, attachment.caption) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.mediaType, attachment.mediaType) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.mediaDetails, attachment.mediaDetails) &&
        Objects.equals(this.post, attachment.post) &&
        Objects.equals(this.sourceUrl, attachment.sourceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateGmt, guid, id, link, modified, modifiedGmt, password, slug, status, type, title, author, commentStatus, pingStatus, altText, caption, description, mediaType, mimeType, mediaDetails, post, sourceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateGmt: ").append(toIndentedString(dateGmt)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    modifiedGmt: ").append(toIndentedString(modifiedGmt)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    commentStatus: ").append(toIndentedString(commentStatus)).append("\n");
    sb.append("    pingStatus: ").append(toIndentedString(pingStatus)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    mediaDetails: ").append(toIndentedString(mediaDetails)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
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

