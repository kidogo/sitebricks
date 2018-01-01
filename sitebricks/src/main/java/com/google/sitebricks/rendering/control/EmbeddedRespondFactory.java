package com.google.sitebricks.rendering.control;

import com.google.sitebricks.Respond;
import com.google.sitebricks.StringBuilderRespond;
import net.jcip.annotations.Immutable;

import java.util.Map;

/**
 * @author Dhanji R. Prasanna (dhanji@gmail com)
 */
@Immutable class EmbeddedRespondFactory {
  //private final Respond respond = new StringBuilderRespond(new Object());

  public EmbeddedRespond get(Object context, Map<String, ArgumentWidget> arguments) {
	final Respond respond = new StringBuilderRespond(context);
    return new EmbeddedRespond(arguments, respond);
  }
}
