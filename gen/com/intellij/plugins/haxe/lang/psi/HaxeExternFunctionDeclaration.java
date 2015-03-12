/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2015 AS3Boyan
 * Copyright 2014-2014 Elias Ku
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

// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaxeExternFunctionDeclaration extends HaxeMethod {

  @NotNull
  List<HaxeAutoBuildMacro> getAutoBuildMacroList();

  @Nullable
  HaxeBlockStatement getBlockStatement();

  @NotNull
  List<HaxeBuildMacro> getBuildMacroList();

  @NotNull
  HaxeComponentName getComponentName();

  @NotNull
  List<HaxeCustomMeta> getCustomMetaList();

  @NotNull
  List<HaxeDebugMeta> getDebugMetaList();

  @NotNull
  List<HaxeDeclarationAttribute> getDeclarationAttributeList();

  @Nullable
  HaxeDoWhileStatement getDoWhileStatement();

  @Nullable
  HaxeExpression getExpression();

  @NotNull
  List<HaxeFinalMeta> getFinalMetaList();

  @Nullable
  HaxeForStatement getForStatement();

  @Nullable
  HaxeGenericParam getGenericParam();

  @NotNull
  List<HaxeGetterMeta> getGetterMetaList();

  @Nullable
  HaxeIfStatement getIfStatement();

  @NotNull
  List<HaxeKeepMeta> getKeepMetaList();

  @NotNull
  List<HaxeMacroMeta> getMacroMetaList();

  @NotNull
  List<HaxeMetaMeta> getMetaMetaList();

  @NotNull
  List<HaxeNoDebugMeta> getNoDebugMetaList();

  @NotNull
  List<HaxeNsMeta> getNsMetaList();

  @NotNull
  List<HaxeOverloadMeta> getOverloadMetaList();

  @Nullable
  HaxeParameterList getParameterList();

  @NotNull
  List<HaxeProtectedMeta> getProtectedMetaList();

  @NotNull
  List<HaxeRequireMeta> getRequireMetaList();

  @Nullable
  HaxeReturnStatement getReturnStatement();

  @NotNull
  List<HaxeSetterMeta> getSetterMetaList();

  @Nullable
  HaxeThrowStatement getThrowStatement();

  @Nullable
  HaxeTypeTag getTypeTag();

  @Nullable
  HaxeWhileStatement getWhileStatement();

}
