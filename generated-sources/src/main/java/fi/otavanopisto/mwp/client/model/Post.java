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
import fi.otavanopisto.mwp.client.model.PostContent;
import fi.otavanopisto.mwp.client.model.PostExcerpt;
import fi.otavanopisto.mwp.client.model.PostGuid;
import fi.otavanopisto.mwp.client.model.PostTitle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Post
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-19T13:15:17.958+03:00")
public class Post   {
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

  @JsonProperty("content")
  private PostContent content = null;

  @JsonProperty("author")
  private Integer author = null;

  @JsonProperty("excerpt")
  private PostExcerpt excerpt = null;

  @JsonProperty("featured_media")
  private Integer featuredMedia = null;

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

  /**
   * The format for the object.
   */
  public enum FormatEnum {
    STANDARD("standard"),
    
    ASIDE("aside"),
    
    CHAT("chat"),
    
    GALLERY("gallery"),
    
    LINK("link"),
    
    IMAGE("image"),
    
    QUOTE("quote"),
    
    STATUS("status"),
    
    VIDEO("video"),
    
    AUDIO("audio");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("format")
  private FormatEnum format = null;

  @JsonProperty("sticky")
  private Boolean sticky = null;

  @JsonProperty("categories")
  private List<String> categories = new ArrayList<String>();

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<String>();

  public Post date(LocalDateTime date) {
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

  public Post dateGmt(LocalDateTime dateGmt) {
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

  public Post guid(PostGuid guid) {
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

  public Post id(Integer id) {
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

  public Post link(String link) {
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

  public Post modified(LocalDateTime modified) {
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

  public Post modifiedGmt(LocalDateTime modifiedGmt) {
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

  public Post password(String password) {
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

  public Post slug(String slug) {
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

  public Post status(StatusEnum status) {
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

  public Post type(String type) {
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

  public Post title(PostTitle title) {
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

  public Post content(PostContent content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostContent getContent() {
    return content;
  }

  public void setContent(PostContent content) {
    this.content = content;
  }

  public Post author(Integer author) {
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

  public Post excerpt(PostExcerpt excerpt) {
    this.excerpt = excerpt;
    return this;
  }

   /**
   * Get excerpt
   * @return excerpt
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostExcerpt getExcerpt() {
    return excerpt;
  }

  public void setExcerpt(PostExcerpt excerpt) {
    this.excerpt = excerpt;
  }

  public Post featuredMedia(Integer featuredMedia) {
    this.featuredMedia = featuredMedia;
    return this;
  }

   /**
   * The id of the featured media for the object.
   * @return featuredMedia
  **/
  @ApiModelProperty(example = "null", value = "The id of the featured media for the object.")
  public Integer getFeaturedMedia() {
    return featuredMedia;
  }

  public void setFeaturedMedia(Integer featuredMedia) {
    this.featuredMedia = featuredMedia;
  }

  public Post commentStatus(CommentStatusEnum commentStatus) {
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

  public Post pingStatus(PingStatusEnum pingStatus) {
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

  public Post format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * The format for the object.
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "The format for the object.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public Post sticky(Boolean sticky) {
    this.sticky = sticky;
    return this;
  }

   /**
   * Whether or not the object should be treated as sticky.
   * @return sticky
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the object should be treated as sticky.")
  public Boolean getSticky() {
    return sticky;
  }

  public void setSticky(Boolean sticky) {
    this.sticky = sticky;
  }

  public Post categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Post addCategoriesItem(String categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * The terms assigned to the object in the category taxonomy.
   * @return categories
  **/
  @ApiModelProperty(example = "null", value = "The terms assigned to the object in the category taxonomy.")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public Post tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Post addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The terms assigned to the object in the post_tag taxonomy.
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The terms assigned to the object in the post_tag taxonomy.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Post post = (Post) o;
    return Objects.equals(this.date, post.date) &&
        Objects.equals(this.dateGmt, post.dateGmt) &&
        Objects.equals(this.guid, post.guid) &&
        Objects.equals(this.id, post.id) &&
        Objects.equals(this.link, post.link) &&
        Objects.equals(this.modified, post.modified) &&
        Objects.equals(this.modifiedGmt, post.modifiedGmt) &&
        Objects.equals(this.password, post.password) &&
        Objects.equals(this.slug, post.slug) &&
        Objects.equals(this.status, post.status) &&
        Objects.equals(this.type, post.type) &&
        Objects.equals(this.title, post.title) &&
        Objects.equals(this.content, post.content) &&
        Objects.equals(this.author, post.author) &&
        Objects.equals(this.excerpt, post.excerpt) &&
        Objects.equals(this.featuredMedia, post.featuredMedia) &&
        Objects.equals(this.commentStatus, post.commentStatus) &&
        Objects.equals(this.pingStatus, post.pingStatus) &&
        Objects.equals(this.format, post.format) &&
        Objects.equals(this.sticky, post.sticky) &&
        Objects.equals(this.categories, post.categories) &&
        Objects.equals(this.tags, post.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateGmt, guid, id, link, modified, modifiedGmt, password, slug, status, type, title, content, author, excerpt, featuredMedia, commentStatus, pingStatus, format, sticky, categories, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Post {\n");
    
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
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    excerpt: ").append(toIndentedString(excerpt)).append("\n");
    sb.append("    featuredMedia: ").append(toIndentedString(featuredMedia)).append("\n");
    sb.append("    commentStatus: ").append(toIndentedString(commentStatus)).append("\n");
    sb.append("    pingStatus: ").append(toIndentedString(pingStatus)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    sticky: ").append(toIndentedString(sticky)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

