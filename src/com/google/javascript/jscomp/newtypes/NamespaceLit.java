/*
 * Copyright 2014 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp.newtypes;

/**
 *
 * @author blickly@google.com (Ben Lickly)
 * @author dimvar@google.com (Dimitris Vardoulakis)
 */
public final class NamespaceLit extends Namespace {
  // collect namespaces during CNT
  // careful w/ inferred vs declared props on namespaces (for otherprops)

  public JSType toJSType() {
    ObjectType objs = ObjectType.makeObjectType(
        null, otherProps, null, false, ObjectKind.UNRESTRICTED);
    return withNamedTypes(objs);
  }
}
