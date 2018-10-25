package names;

/*
 * ModuleDirective:
 * 		requires {RequiresModifier} ModuleName;
 * 		exports PackageName [to ModuleName {,ModuleName}];
 * 		opens PackageName [to ModuleName {,ModuleName}];
 * 		use TypeName;
 * 		provides TypeName with TypeName {,TypeName};
 *
 */
public abstract class ModuleDirective {
		public abstract String toString();
}
