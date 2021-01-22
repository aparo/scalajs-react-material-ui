package io.kinoplan.scalajs.react.material.ui.lab


trait CreateFilterOptionsConfig[T] {
def ignoreAccents?: boolean;
def ignoreCase?: boolean;
def limit?: number;
def matchFrom?: 'any' | 'start';
def stringify?: (option: T) => string;
def trim?: boolean;
}

trait FilterOptionsState[T] {
inputValue: string;
getOptionLabel: (option: T) => string;
}

export interface AutocompleteRenderOptionState {
inputValue: string;
selected: boolean;
}

export type AutocompleteGetTagProps = ({ index }: { index: number }) => {};

export interface AutocompleteRenderGroupParams {
key: string;
group: string;
children: React.ReactNode;
}

export interface AutocompleteRenderInputParams {
id: string;
disabled: boolean;
fullWidth: boolean;
size: 'small' | undefined;
InputLabelProps: object;
InputProps: {
ref: React.Ref<any>;
className: string;
startAdornment: React.ReactNode;
endAdornment: React.ReactNode;
};
inputProps: object;
}


object MuiAutocomplete {

}
