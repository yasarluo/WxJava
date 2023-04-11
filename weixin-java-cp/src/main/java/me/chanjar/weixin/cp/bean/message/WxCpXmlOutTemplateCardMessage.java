package me.chanjar.weixin.cp.bean.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.util.xml.XStreamCDataConverter;

import java.io.Serializable;

/**
 * The type Wx cp xml out template card message.
 *
 * @author yasarluo  created on  2023-04-10
 */
@XStreamAlias("xml")
@Data
@EqualsAndHashCode(callSuper = false)
public class WxCpXmlOutTemplateCardMessage extends WxCpXmlOutMessage {

  private static final long serialVersionUID = -4778501910314559952L;

  /**
   * The Template Card
   */
  @XStreamAlias("TemplateCard")
  protected TemplateCard templateCard;

  /**
   * Instantiates a new Wx cp xml out template card message.
   */
  public WxCpXmlOutTemplateCardMessage() {
    this.msgType = WxConsts.XmlMsgType.UPDATE_TEMPLATE_CARD;
  }

  /**
   * The type TemplateCard
   */
  @XStreamAlias("TemplateCard")
  @Data
  public static class TemplateCard implements Serializable {
    @XStreamAlias("CardType")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String cardType;

    @XStreamAlias("Source")
    private Source source;

    @XStreamAlias("MainTitle")
    private MainTitle mainTitle;

    @XStreamAlias("SubTitleText")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String subTitleText;

    @XStreamAlias("HorizontalContentList")
    private HorizontalContentList horizontalContentList;

    @XStreamAlias("Source")
    @Data
    public static class Source implements Serializable {
      private static final long serialVersionUID = -102365360381006206L;

      @XStreamAlias("IconUrl")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String iconUrl;

      @XStreamAlias("Desc")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String desc;

      @XStreamAlias("DescColor")
      private int descColor;
    }

    @XStreamAlias("MainTitle")
    @Data
    public static class MainTitle implements Serializable {
      private static final long serialVersionUID = 2853992712508622033L;

      @XStreamAlias("Title")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String title;

      @XStreamAlias("Desc")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String desc;
    }

    @XStreamAlias("HorizontalContentList")
    @Data
    public static class HorizontalContentList implements Serializable {
      private static final long serialVersionUID = -1090885828975935498L;

      @XStreamAlias("KeyName")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String keyName;

      @XStreamAlias("Value")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String value;

      @XStreamAlias("Type")
      private int type;

      @XStreamAlias("Url")
      @XStreamConverter(value = XStreamCDataConverter.class)
      private String url;
    }
  }
}
