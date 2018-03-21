import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_onlineBooking_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir:'css',file:'bootstrap.css'))
printHtmlPart(3)
expressionOut.print(resource(dir:'css',file:'flexslider.css'))
printHtmlPart(4)
expressionOut.print(resource(dir:'css',file:'style.css'))
printHtmlPart(5)
expressionOut.print(resource(dir:'css',file:'font-awesome.css'))
printHtmlPart(6)
invokeTag('layoutHead','g',24,[:],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',25,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('render','g',27,['template':("layouts/headerMenu")],-1)
printHtmlPart(1)
invokeTag('layoutBody','g',28,[:],-1)
printHtmlPart(8)
invokeTag('message','g',30,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(9)
expressionOut.print(resource(dir:'js',file:'jquery-2.1.4.min.js'))
printHtmlPart(10)
expressionOut.print(resource(dir:'js',file:'move-top.js'))
printHtmlPart(11)
expressionOut.print(resource(dir:'js',file:'easing.js'))
printHtmlPart(12)
expressionOut.print(resource(dir:'js',file:'responsiveslides.min.js'))
printHtmlPart(13)
expressionOut.print(resource(dir:'js',file:'jquery.waypoints.min.js'))
printHtmlPart(14)
expressionOut.print(resource(dir:'js',file:'jquery.countup.js'))
printHtmlPart(14)
expressionOut.print(resource(dir:'js',file:'bootstrap.js'))
printHtmlPart(15)
expressionOut.print(resource(dir:'js',file:'jquery.flexslider.js'))
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',139,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1521546569000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
