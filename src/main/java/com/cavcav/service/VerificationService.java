package com.cavcav.service;

import com.cavcav.domain.*;
import com.cavcav.exception.*;
import com.cavcav.model.*;

public interface VerificationService {

    VerificationCode createVerificationCode(String otp, String email);
}
