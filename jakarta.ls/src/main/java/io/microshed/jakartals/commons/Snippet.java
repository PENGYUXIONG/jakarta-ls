package io.microshed.jakartals.commons;

import java.util.List;
import java.util.function.Predicate;

public class Snippet {
    private List<String> prefixes;
    private List<String> body;
    private String description;
    private String scope;
    private ISnippetContext<?> context;


    public List<String> getPrefixes() {
		return prefixes;
	}

	public void setPrefixes(List<String> prefixes) {
		this.prefixes = prefixes;
	}

	public List<String> getBody() {
		return body;
	}

	public void setBody(List<String> body) {
		this.body = body;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public ISnippetContext<?> getContext() {
		return context;
	}

	public void setContext(ISnippetContext<?> context) {
		this.context = context;
	}

	public boolean hasContext() {
		return getContext() != null;
	}

	public boolean match(Predicate<ISnippetContext<?>> contextFilter) {
		if (!hasContext()) {
			return true;
		}
		return contextFilter.test(getContext());
	}
}