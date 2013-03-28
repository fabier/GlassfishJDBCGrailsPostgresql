<%@ page import="glassfishjdbcgrailspostgresql.Sample" %>



<div class="fieldcontain ${hasErrors(bean: sampleInstance, field: 'info', 'error')} ">
	<label for="info">
		<g:message code="sample.info.label" default="Info" />
		
	</label>
	<g:textField name="info" value="${sampleInstance?.info}"/>
</div>

