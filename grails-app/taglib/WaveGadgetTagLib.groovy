class WaveGadgetTagLib {

	static namespace = 'g'
	
	def gadget = {
		attrs, body ->
		
		def hasTitle = attrs.title ? true : false
		def title = """ title="${attrs.title}" """
		def features = attrs.features
		def VALID_FEATURES = [ "setprefs", "dynamic-height", "tabs", "minimessage", "flash", "locked-domain" ]
		
		out << """<?xml version="1.0" encoding="UTF-8"?>
<Module>
	<ModulePrefs ${ hasTitle ? title : "" }>
		${ hasTitle ? '<Require feature="title"/>' : "" }
		"""
	
		// output valid features
		features.each{ feature ->
			if( VALID_FEATURES.contains( feature ) ){
				out << """
		<Require feature="${feature}" />  
					"""
			}
		}
	
		out << """		
	</ModulePrefs>
	<Content type="html">
	<![CDATA[
			"""
	
		out << body()
		
		out << """
	]]>
	</Content>
</Module>
		"""
	}
	
}
