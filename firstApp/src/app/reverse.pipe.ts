import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'reverse'
})
export class ReversePipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    var output:string="";
    for(let index=value.length-1;index>=0;index--){

      output += value[index];
    }
    return output;
  }
}
