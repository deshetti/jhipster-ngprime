import { NgModule } from '@angular/core';

import { DegaresearchSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [DegaresearchSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [DegaresearchSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class DegaresearchSharedCommonModule {}
